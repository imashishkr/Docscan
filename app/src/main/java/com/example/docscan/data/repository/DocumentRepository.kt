interface DocumentRepository {
    suspend fun save(document: Document)
    suspend fun getDocuments(): List<Document>
    suspend fun delete(id: String)
}
