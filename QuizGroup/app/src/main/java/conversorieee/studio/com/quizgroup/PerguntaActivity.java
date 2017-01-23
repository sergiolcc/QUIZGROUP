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

    private String[] valor = new String[6];

    private DatabaseReference databaseReferencia = FirebaseDatabase.getInstance().getReference();
    DatabaseReference question = databaseReferencia.child("Dados").child("Pergunta");



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

                Log.i("FIREBASE", valor[0]);
                Log.i("FIREBASETWO", valor[1]);
                Log.i("FIREBASETHREE", valor[2]);
                Log.i("FIREBASEFOUR", valor[3]);
                Log.i("FIREBASEFIVE", valor[4]);
                Log.i("FIREBASESIX", valor[5]);

                objetos1.setPergunta(valor[0]);
                objetos1.setOption1(valor[1]);
                objetos1.setOption2(valor[2]);
                objetos1.setOption3(valor[3]);
                objetos1.setOption4(valor[4]);
                objetos1.setRespostaCerta(valor[5]);


                pergunta.setText(objetos1.getPergunta());
                opt1.setText(objetos1.getOption1());
                opt2.setText(objetos1.getOption2());
                opt3.setText(objetos1.getOption3());
                opt4.setText(objetos1.getOption4());
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

                Log.w("ERRO", "Failed to read value.", databaseError.toException());
            }
        });


    }
}
