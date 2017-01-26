package conversorieee.studio.com.quizgroup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/**
 * Created by Sergio on 22/01/2017.
 */

public class PerguntaActivity extends AppCompatActivity {


    private TextView pergunta;
    private Button opt1;
    private Button opt2;
    private Button opt3;
    private Button opt4;

    DADOSPERG1 objetos1 = new DADOSPERG1();
    DADOSPERG2 objetos2 = new DADOSPERG2();
    DADOSPERG3 objetos3 = new DADOSPERG3();
    DADOSPERG4 objetos4 = new DADOSPERG4();
    DADOSPERG5 objetos5 = new DADOSPERG5();

    private String[] valor = new String[6];

    private DatabaseReference databaseReferencia = FirebaseDatabase.getInstance().getReference();
    DatabaseReference question = databaseReferencia.child("Dados").child("Pergunta");
    DatabaseReference questionTwo = databaseReferencia.child("Dados").child("Pergunta2");
    DatabaseReference questionThree = databaseReferencia.child("Dados").child("Pergunta3");
    DatabaseReference questionFour = databaseReferencia.child("Dados").child("Pergunta4");
    DatabaseReference questionFive = databaseReferencia.child("Dados").child("Pergunta5");



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta);

        pergunta = (TextView) findViewById(R.id.perguntaid);
        opt1 = (Button) findViewById(R.id.op1id);
        opt2 = (Button) findViewById(R.id.op2id);
        opt3 = (Button) findViewById(R.id.op3id);
        opt4 = (Button) findViewById(R.id.op4id);

        question.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                valor[0] = dataSnapshot.child("001").getValue(String.class);
                valor[1] = dataSnapshot.child("002").getValue(String.class);
                valor[2] = dataSnapshot.child("003").getValue(String.class);
                valor[3] = dataSnapshot.child("004").getValue(String.class);
                valor[4] = dataSnapshot.child("005").getValue(String.class);
                valor[5] = dataSnapshot.child("006").getValue(String.class);

                objetos1.setPergunta(valor[0]);
                objetos1.setOption1(valor[1]);
                objetos1.setOption2(valor[2]);
                objetos1.setOption3(valor[3]);
                objetos1.setOption4(valor[4]);
                objetos1.setRespostaCerta(valor[5]);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

                Log.w("ERRO", "Failed to read value.", databaseError.toException());
            }
        });

        questionTwo.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                valor[0] = dataSnapshot.child("001").getValue(String.class);
                valor[1] = dataSnapshot.child("002").getValue(String.class);
                valor[2] = dataSnapshot.child("003").getValue(String.class);
                valor[3] = dataSnapshot.child("004").getValue(String.class);
                valor[4] = dataSnapshot.child("005").getValue(String.class);
                valor[5] = dataSnapshot.child("006").getValue(String.class);

                objetos2.setPergunta(valor[0]);
                objetos2.setOption1(valor[1]);
                objetos2.setOption2(valor[2]);
                objetos2.setOption3(valor[3]);
                objetos2.setOption4(valor[4]);
                objetos2.setRespostaCerta(valor[5]);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

                Log.w("ERRO", "Failed to read value.", databaseError.toException());
            }
        });

        questionThree.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                valor[0] = dataSnapshot.child("001").getValue(String.class);
                valor[1] = dataSnapshot.child("002").getValue(String.class);
                valor[2] = dataSnapshot.child("003").getValue(String.class);
                valor[3] = dataSnapshot.child("004").getValue(String.class);
                valor[4] = dataSnapshot.child("005").getValue(String.class);
                valor[5] = dataSnapshot.child("006").getValue(String.class);

                objetos3.setPergunta(valor[0]);
                objetos3.setOption1(valor[1]);
                objetos3.setOption2(valor[2]);
                objetos3.setOption3(valor[3]);
                objetos3.setOption4(valor[4]);
                objetos3.setRespostaCerta(valor[5]);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

                Log.w("ERRO", "Failed to read value.", databaseError.toException());
            }
        });

        questionFour.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                valor[0] = dataSnapshot.child("001").getValue(String.class);
                valor[1] = dataSnapshot.child("002").getValue(String.class);
                valor[2] = dataSnapshot.child("003").getValue(String.class);
                valor[3] = dataSnapshot.child("004").getValue(String.class);
                valor[4] = dataSnapshot.child("005").getValue(String.class);
                valor[5] = dataSnapshot.child("006").getValue(String.class);

                objetos4.setPergunta(valor[0]);
                objetos4.setOption1(valor[1]);
                objetos4.setOption2(valor[2]);
                objetos4.setOption3(valor[3]);
                objetos4.setOption4(valor[4]);
                objetos4.setRespostaCerta(valor[5]);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

                Log.w("ERRO", "Failed to read value.", databaseError.toException());
            }
        });

        questionFive.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                valor[0] = dataSnapshot.child("001").getValue(String.class);
                valor[1] = dataSnapshot.child("002").getValue(String.class);
                valor[2] = dataSnapshot.child("003").getValue(String.class);
                valor[3] = dataSnapshot.child("004").getValue(String.class);
                valor[4] = dataSnapshot.child("005").getValue(String.class);
                valor[5] = dataSnapshot.child("006").getValue(String.class);

                objetos5.setPergunta(valor[0]);
                objetos5.setOption1(valor[1]);
                objetos5.setOption2(valor[2]);
                objetos5.setOption3(valor[3]);
                objetos5.setOption4(valor[4]);
                objetos5.setRespostaCerta(valor[5]);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

                Log.w("ERRO", "Failed to read value.", databaseError.toException());
            }
        });


    }
}
