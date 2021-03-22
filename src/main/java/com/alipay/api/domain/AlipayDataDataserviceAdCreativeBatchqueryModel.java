package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询创意列表
 *
 * @author auto create
 * @since 1.0, 2020-11-13 16:46:33
 */
public class AlipayDataDataserviceAdCreativeBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3224844582383722591L;

	/**
	 * 创意分组标识，多个创意可按业务逻辑标识为一个分组
	 */
	@ApiField("batch_tag")
	private String batchTag;

	/**
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 分页查询当前页(从第1页开始)，默认值为1
	 */
	@ApiField("current")
	private Long current;

	/**
	 * 外部平台导入广告库后，广告投放单元对应的外部资源ID
	 */
	@ApiField("group_outer_id")
	private String groupOuterId;

	/**
	 * 分页查询单页记录数，默认值为20，单页不能超过1w
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 外部平台导入广告库后，广告投放计划对应的外部资源ID
	 */
	@ApiField("plan_outer_id")
	private String planOuterId;

	/**
	 * 创意状态，ENABLE-生效；PAUSE-暂停；DELETE-删除；AUDIT-审核中；REFUSED-审核拒绝
	 */
	@ApiField("status")
	private String status;

	public String getBatchTag() {
		return this.batchTag;
	}
	public void setBatchTag(String batchTag) {
		this.batchTag = batchTag;
	}

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public Long getCurrent() {
		return this.current;
	}
	public void setCurrent(Long current) {
		this.current = current;
	}

	public String getGroupOuterId() {
		return this.groupOuterId;
	}
	public void setGroupOuterId(String groupOuterId) {
		this.groupOuterId = groupOuterId;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getPlanOuterId() {
		return this.planOuterId;
	}
	public void setPlanOuterId(String planOuterId) {
		this.planOuterId = planOuterId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
