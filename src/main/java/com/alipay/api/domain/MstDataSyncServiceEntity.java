package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 巡检平台数据同步服务数据
 *
 * @author auto create
 * @since 1.0, 2019-03-20 21:37:20
 */
public class MstDataSyncServiceEntity extends AlipayObject {

	private static final long serialVersionUID = 7339937888254492476L;

	/**
	 * 业务数据唯一id
	 */
	@ApiField("biz_uniq_id")
	private String bizUniqId;

	/**
	 * 自定义扩展信息，JSON字符串。
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 业务数据操作类型。add-新增，modify-修改，delete-删除。业务方负责数据的生命周期管理，当一个连接不再需要检测时，应及时通知巡检平台删除。当一个业务连接改变时，也应及时通知巡检平台更新。
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 业务数据名称
	 */
	@ApiField("service_title")
	private String serviceTitle;

	/**
	 * 业务数据连接。必须是有效的url
	 */
	@ApiField("service_url")
	private String serviceUrl;

	public String getBizUniqId() {
		return this.bizUniqId;
	}
	public void setBizUniqId(String bizUniqId) {
		this.bizUniqId = bizUniqId;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getServiceTitle() {
		return this.serviceTitle;
	}
	public void setServiceTitle(String serviceTitle) {
		this.serviceTitle = serviceTitle;
	}

	public String getServiceUrl() {
		return this.serviceUrl;
	}
	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

}
