class DocumentRepositoryImpl(
    private val dao: DocumentDao
) : DocumentRepository {

    override suspend fun save(document: Document) {
        dao.insert(
            DocumentEntity(
                id = document.id,
                title = document.title,
                filePath = document.filePath,
                createdAt = document.createdAt
            )
        )
    }

    override suspend fun getDocuments(): List<Document> {
        return dao.getAll().map {
            Document(it.id, it.title, it.filePath, it.createdAt)
        }
    }

    override suspend fun delete(id: String) {
        dao.delete(id)
    }
}
