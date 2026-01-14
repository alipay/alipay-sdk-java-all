package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.marketing.plan.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-13 19:12:40
 */
public class AlipayCommerceIotMarketingPlanQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8336563225627193516L;

	/** 
	 * 设备bizTid
	 */
	@ApiListField("biz_ids")
	@ApiField("string")
	private List<String> bizIds;

	/** 
	 * 创建时间时间戳
	 */
	@ApiField("create_time")
	private Long createTime;

	/** 
	 * 结束时间戳
	 */
	@ApiField("end_time")
	private String endTime;

	/** 
	 * 上传图片的文件id
	 */
	@ApiField("file_id")
	private String fileId;

	/** 
	 * 修改时间时间戳
	 */
	@ApiField("modify_time")
	private Long modifyTime;

	/** 
	 * 投放计划Id
	 */
	@ApiField("plan_id")
	private String planId;

	/** 
	 * 投放计划名称
	 */
	@ApiField("plan_name")
	private String planName;

	/** 
	 * 优先级
	 */
	@ApiField("priority")
	private Long priority;

	/** 
	 * 海报图片展位编码
	 */
	@ApiField("space_code")
	private String spaceCode;

	/** 
	 * 开始时间戳
	 */
	@ApiField("start_time")
	private Long startTime;

	/** 
	 * WAITTING_AUDIT(0, "待审核"),
    AUDITING(1, "审核中"),
    AUDIT_SUCCESS(2, "审核成功"),
    AUDIT_FAIL(3, "审核失败"),
    ONLINE(4, "已上线"),
    OFFLINE(5, "已失效");
	 */
	@ApiField("status")
	private Long status;

	public void setBizIds(List<String> bizIds) {
		this.bizIds = bizIds;
	}
	public List<String> getBizIds( ) {
		return this.bizIds;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	public Long getCreateTime( ) {
		return this.createTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getEndTime( ) {
		return this.endTime;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getFileId( ) {
		return this.fileId;
	}

	public void setModifyTime(Long modifyTime) {
		this.modifyTime = modifyTime;
	}
	public Long getModifyTime( ) {
		return this.modifyTime;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}
	public String getPlanId( ) {
		return this.planId;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanName( ) {
		return this.planName;
	}

	public void setPriority(Long priority) {
		this.priority = priority;
	}
	public Long getPriority( ) {
		return this.priority;
	}

	public void setSpaceCode(String spaceCode) {
		this.spaceCode = spaceCode;
	}
	public String getSpaceCode( ) {
		return this.spaceCode;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}
	public Long getStartTime( ) {
		return this.startTime;
	}

	public void setStatus(Long status) {
		this.status = status;
	}
	public Long getStatus( ) {
		return this.status;
	}

}
