package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SoundInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.antbooks.sound.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-24 00:01:57
 */
public class AlipayUserAntbooksSoundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7689554848168595739L;

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
	 * 声音信息列表
	 */
	@ApiListField("sound_info_list")
	@ApiField("sound_info")
	private List<SoundInfo> soundInfoList;

	/** 
	 * 声音总数
	 */
	@ApiField("total_count")
	private Long totalCount;

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

	public void setSoundInfoList(List<SoundInfo> soundInfoList) {
		this.soundInfoList = soundInfoList;
	}
	public List<SoundInfo> getSoundInfoList( ) {
		return this.soundInfoList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
