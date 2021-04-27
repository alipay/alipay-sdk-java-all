package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部事件同步
 *
 * @author auto create
 * @since 1.0, 2018-03-08 16:41:54
 */
public class AlipayOpenDataItemSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4534838974316693696L;

	/**
	 * 变更事件类型
枚举值
1 展台信息变更
2 首页投放状态变更
	 */
	@ApiField("event_type")
	private String eventType;

	/**
	 * 扩展信息，JSON格式，内容包含可能有:
catagory_code 分类code
area_code 地区code
service_code 服务code
status 状态
audit_time 审核时间
reason 审核反馈
operator 操作人
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 外部修改key
event_type 加 external_id 全局唯一
展台信息变更时填写展台id
投放信息变更时填写投放id
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 变更时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 操作类型
枚举值
ADD 新增
UPDATE 修改
DEL 删除
	 */
	@ApiField("operate_type")
	private String operateType;

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

}
