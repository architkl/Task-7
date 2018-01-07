package architkl.com.taskseven;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Movie> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MoviesAdapter moviesAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        moviesAdapter = new MoviesAdapter(movieList);

        layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(moviesAdapter);

        prepareMovieData();
    }

    private void prepareMovieData() {
        Movie movie = new Movie("The Shawshank Redemption", "Crime & Drama");
        movieList.add(movie);

        movie = new Movie("The Dark Knight", "Action, Crime & Drama");
        movieList.add(movie);

        movie = new Movie("Fight Club", "Drama");
        movieList.add(movie);

        movie = new Movie("Inception", "Action, Adventure & Sci-Fi");
        movieList.add(movie);

        movie = new Movie("Interstellar", "Adventure, Drama & Sci-Fi");
        movieList.add(movie);

        moviesAdapter.notifyDataSetChanged();
    }
}
