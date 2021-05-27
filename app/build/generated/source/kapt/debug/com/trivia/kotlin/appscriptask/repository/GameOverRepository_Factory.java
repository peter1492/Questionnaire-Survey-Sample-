// Generated by Dagger (https://dagger.dev).
package com.trivia.kotlin.appscriptask.repository;

import com.trivia.kotlin.appscriptask.database.SummaryDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GameOverRepository_Factory implements Factory<GameOverRepository> {
  private final Provider<SummaryDao> summaryDaoProvider;

  public GameOverRepository_Factory(Provider<SummaryDao> summaryDaoProvider) {
    this.summaryDaoProvider = summaryDaoProvider;
  }

  @Override
  public GameOverRepository get() {
    return newInstance(summaryDaoProvider.get());
  }

  public static GameOverRepository_Factory create(Provider<SummaryDao> summaryDaoProvider) {
    return new GameOverRepository_Factory(summaryDaoProvider);
  }

  public static GameOverRepository newInstance(SummaryDao summaryDao) {
    return new GameOverRepository(summaryDao);
  }
}
