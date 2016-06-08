package talentica.com.booksharingapp.domain.repository;

import rx.Observable;
import talentica.com.booksharingapp.domain.model.BorrowedBook;

public interface BorrowedBookRepository {


    Observable<Boolean> insert(BorrowedBook model);

    Observable<Boolean> update(BorrowedBook model);

    Observable<BorrowedBook> get(Object id);

    Observable<Boolean> delete(BorrowedBook model);


}
