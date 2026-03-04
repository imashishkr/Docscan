sealed class ScannerState {
    object Idle : ScannerState()
    object Scanning : ScannerState()
    object Saved : ScannerState()
    data class Error(val message: String) : ScannerState()
}
