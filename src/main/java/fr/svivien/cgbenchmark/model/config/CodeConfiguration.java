package fr.svivien.cgbenchmark.model.config;

import java.util.List;

public class CodeConfiguration {

    private String sourcePath;
    private Integer nbReplays;
    private String language;
    private List<EnemyConfiguration> enemies;

    public List<EnemyConfiguration> getEnemies() {
        return enemies;
    }

    public String getSourcePath() {
        return sourcePath;
    }

    public Integer getNbReplays() {
        return nbReplays;
    }

    public String getLanguage() {
        return language;
    }

}
