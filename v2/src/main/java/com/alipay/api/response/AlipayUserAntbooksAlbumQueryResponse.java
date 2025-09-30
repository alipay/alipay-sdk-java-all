package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AlbumInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.antbooks.album.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-24 21:56:57
 */
public class AlipayUserAntbooksAlbumQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7116656525652934339L;

	/** 
	 * 专辑信息列表
	 */
	@ApiListField("album_info_list")
	@ApiField("album_info")
	private List<AlbumInfo> albumInfoList;

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
	 * 专辑总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setAlbumInfoList(List<AlbumInfo> albumInfoList) {
		this.albumInfoList = albumInfoList;
	}
	public List<AlbumInfo> getAlbumInfoList( ) {
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

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
