package dev.witheredflowers.introtodebuginng

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
	fun pembagian() {
		// Angka yang akan dibagi
		val numerator = 60
		// Angka pembagi
		var denominator = 4
		
		// Awalnya di sini repeatnya menggunakan 5
		// Akan terkena error bahwa Angka yang akan dibagi adalah 0
		// sehingga 0 dibagi berapapun = tak terhingga
		// error aritmatika
		
		// solus: ganti repeat 5 jadi repeat 4
		// repeat(5) {
		repeat(4) {
			Log.v(TAG, "${numerator / denominator}")
			denominator--
		}
	}
	
	fun logging() {
		// log level: error
		Log.e(TAG, "ERROR: error yang kritis seperti aplikasi 'ngamuk'")
		// log level: warn
		Log.w(TAG, "WARN: peringatan terhadap potensi error yang serius")
		// log level: info
		Log.i(TAG, "INFO: pemberitahuan informasi teknikal, seperti operasi yang sukses")
		// log level: debug
		Log.d(TAG, "DEBUG: pemberitahuan informasi teknikal yang berguna untuk debugging")
		// log level: verbose
		Log.v(TAG, "VERBOSE: lebih detil daripada log DEBUG")
	}
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		// Kode ini akan error karena layout belum ditemplokin, tapi udah manggil TextView
		setContentView(R.layout.activity_main)
		// Sebelumnya errornya di sini karena di set sebelum setContentView
		Log.d(TAG, "Sebelumnya error di sini")
		val helloTextView: TextView = findViewById(R.id.hello_world)
		Log.d(TAG, "Sekarang sudah tidak error")
		helloTextView.text = "Hello, Debugging !"
		logging()
		pembagian()
	}
}