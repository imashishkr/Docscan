class ScannerActivity : AppCompatActivity() {

    private lateinit var viewModel: ScannerViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = ViewModelProvider(this)[ScannerViewModel::class.java]

        startScan()
    }

    private fun startScan() {
        // launch ML Kit scanner
    }
}
