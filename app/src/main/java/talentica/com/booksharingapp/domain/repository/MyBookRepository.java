package talentica.com.booksharingapp.domain.repository;

import rx.Observable;
import talentica.com.booksharingapp.domain.model.MyBook;

public interface MyBookRepository {


    Observable<Boolean> insert(MyBook model);

    Observable<Boolean> update(MyBook model);

    Observable<MyBook> get(Object id);

    Observable<Boolean> delete(MyBook model);
}
