package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShortPlayAlbumInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.lifecreation.shortplaylist.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-04 23:37:49
 */
public class AlipaySocialBaseLifecreationShortplaylistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1749633773947245822L;

	/** 
	 * 剧目列表
	 */
	@ApiListField("album_info_list")
	@ApiField("short_play_album_info")
	private List<ShortPlayAlbumInfo> albumInfoList;

	/** 
	 * 当前页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 分页条目数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数
	 */
	@ApiField("total")
	private Long total;

	public void setAlbumInfoList(List<ShortPlayAlbumInfo> albumInfoList) {
		this.albumInfoList = albumInfoList;
	}
	public List<ShortPlayAlbumInfo> getAlbumInfoList( ) {
		return this.albumInfoList;
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

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
