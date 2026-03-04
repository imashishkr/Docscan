class ScannerViewModel(
    private val repository: DocumentRepository
) : ViewModel() {

    fun saveDocument(path: String) {
        viewModelScope.launch {
            val document = Document(
                id = UUID.randomUUID().toString(),
                title = "Scan",
                filePath = path,
                createdAt = System.currentTimeMillis()
            )
            repository.save(document)
        }
    }
}
