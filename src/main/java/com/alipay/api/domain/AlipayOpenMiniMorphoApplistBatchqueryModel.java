package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 应用批量查询
 *
 * @author auto create
 * @since 1.0, 2020-08-20 19:50:54
 */
public class AlipayOpenMiniMorphoApplistBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3653729993767664349L;

	/**
	 * 批量查询时的，闪蝶应用ID数组
	 */
	@ApiListField("app_ids")
	@ApiField("string")
	private List<String> appIds;

	/**
	 * 闪蝶身份验证信息
	 */
	@ApiField("identity")
	private MorphoIdentity identity;

	/**
	 * 查询应用关键词
	 */
	@ApiField("keyword")
	private String keyword;

	/**
	 * 应用在线状态
	 */
	@ApiField("online_state")
	private Long onlineState;

	/**
	 * 分页查询页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 应用状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 应用类型
	 */
	@ApiField("type")
	private String type;

	public List<String> getAppIds() {
		return this.appIds;
	}
	public void setAppIds(List<String> appIds) {
		this.appIds = appIds;
	}

	public MorphoIdentity getIdentity() {
		return this.identity;
	}
	public void setIdentity(MorphoIdentity identity) {
		this.identity = identity;
	}

	public String getKeyword() {
		return this.keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Long getOnlineState() {
		return this.onlineState;
	}
	public void setOnlineState(Long onlineState) {
		this.onlineState = onlineState;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
