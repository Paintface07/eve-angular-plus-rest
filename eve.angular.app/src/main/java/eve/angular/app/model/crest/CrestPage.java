package eve.angular.app.model.crest;

// TODO: consider the usefulness of this interface or something similar
public interface CrestPage<T> {
	public Long getPageCount();
	public EveApiLink getNext();
	public Long getTotalCount();
	
	public void setPageCount(Long pageCount);
	public void setNext(EveApiLink next);
	public void setTotalCount(Long totalCount);
}

