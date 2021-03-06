package application.dependencies;

import org.springframework.stereotype.Service;

import javax.inject.Named;


@Service
@Named("naturalnumbers")
public class SequentialGenerationStrategy implements GenerationStrategy{

    private int nextNum = 0;

    public int next() {
        return nextNum++;
    }
}
