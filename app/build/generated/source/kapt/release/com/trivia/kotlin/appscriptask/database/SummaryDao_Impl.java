package com.trivia.kotlin.appscriptask.database;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.trivia.kotlin.appscriptask.modal.Summary;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class SummaryDao_Impl implements SummaryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Summary> __insertionAdapterOfSummary;

  private final EntityDeletionOrUpdateAdapter<Summary> __updateAdapterOfSummary;

  public SummaryDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSummary = new EntityInsertionAdapter<Summary>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `summary_table` (`id`,`name`,`startDate`,`summary`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Summary value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        stmt.bindLong(3, value.getStartDate());
        if (value.getSummary() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getSummary());
        }
      }
    };
    this.__updateAdapterOfSummary = new EntityDeletionOrUpdateAdapter<Summary>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `summary_table` SET `id` = ?,`name` = ?,`startDate` = ?,`summary` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Summary value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        stmt.bindLong(3, value.getStartDate());
        if (value.getSummary() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getSummary());
        }
        stmt.bindLong(5, value.getId());
      }
    };
  }

  @Override
  public Object insertSummary(final Summary summary, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfSummary.insert(summary);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object updateSummary(final Summary summary, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfSummary.handle(summary);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public LiveData<List<Summary>> getAllSummary() {
    final String _sql = "Select * from summary_table order by startDate";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"summary_table"}, false, new Callable<List<Summary>>() {
      @Override
      public List<Summary> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfStartDate = CursorUtil.getColumnIndexOrThrow(_cursor, "startDate");
          final int _cursorIndexOfSummary = CursorUtil.getColumnIndexOrThrow(_cursor, "summary");
          final List<Summary> _result = new ArrayList<Summary>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Summary _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final long _tmpStartDate;
            _tmpStartDate = _cursor.getLong(_cursorIndexOfStartDate);
            final String _tmpSummary;
            if (_cursor.isNull(_cursorIndexOfSummary)) {
              _tmpSummary = null;
            } else {
              _tmpSummary = _cursor.getString(_cursorIndexOfSummary);
            }
            _item = new Summary(_tmpId,_tmpName,_tmpStartDate,_tmpSummary);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
