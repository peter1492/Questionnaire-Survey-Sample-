// Generated by Dagger (https://dagger.dev).
package com.trivia.kotlin.appscriptask.view_models;

import com.trivia.kotlin.appscriptask.repository.GameOverRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GameOverViewModel_Factory implements Factory<GameOverViewModel> {
  private final Provider<GameOverRepository> repositoryProvider;

  public GameOverViewModel_Factory(Provider<GameOverRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GameOverViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static GameOverViewModel_Factory create(Provider<GameOverRepository> repositoryProvider) {
    return new GameOverViewModel_Factory(repositoryProvider);
  }

  public static GameOverViewModel newInstance(GameOverRepository repository) {
    return new GameOverViewModel(repository);
  }
}