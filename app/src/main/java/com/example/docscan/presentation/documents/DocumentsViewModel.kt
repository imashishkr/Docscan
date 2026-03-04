import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class DocumentsViewModel(
    private val repository: DocumentRepository
) : ViewModel() {

    private val _documents = MutableStateFlow<List<Document>>(emptyList())
    val documents: StateFlow<List<Document>> = _documents

    fun loadDocuments() {
        viewModelScope.launch {
            _documents.value = repository.getDocuments()
        }
    }
}
