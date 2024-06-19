package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ChapterInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.antbookcontent.chapter.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-23 11:41:58
 */
public class AlipayUserAntbookcontentChapterQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6684377787871359889L;

	/** 
	 * 章节信息列表，列表中有记录代表已进件，无记录代表未进件或进件失败
	 */
	@ApiListField("chapter_info_list")
	@ApiField("chapter_info")
	private List<ChapterInfo> chapterInfoList;

	/** 
	 * 当前页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 章节总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setChapterInfoList(List<ChapterInfo> chapterInfoList) {
		this.chapterInfoList = chapterInfoList;
	}
	public List<ChapterInfo> getChapterInfoList( ) {
		return this.chapterInfoList;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
