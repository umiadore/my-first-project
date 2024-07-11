import java.util.ArrayList;
import java.util.List;

public class TransactionsHistory {

   private final List<TransactionRecord> records;

    public TransactionsHistory(List<TransactionRecord> records) {
        this.records = new ArrayList<>();
    }

    public void addRecord(TransactionRecord record){
        records.add(record);
    }
    public void printHistory(){
        for (TransactionRecord record:records) {
            System.out.println(record);

        }

        }
    }

