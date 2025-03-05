package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设置群欢迎语及群公告等其他设置
 *
 * @author auto create
 * @since 1.0, 2022-09-20 19:27:27
 */
public class AlipaySocialBaseBcClustersettingModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2698172859543575942L;

	/**
	 * 客户群分组id，此id唯一，分组下会管理一系列的客户群
	 */
	@ApiField("cluster_id")
	private String clusterId;

	/**
	 * 群公告
	 */
	@ApiField("notice")
	private String notice;

	/**
	 * 操作的商家标识id，可选，默认是应用app下的pid；如果填写第三方商家标识id，需要保证app下的pid是该商家的管理员
	 */
	@ApiField("operate_business_id")
	private String operateBusinessId;

	/**
	 * 客户群业务租户id，比如生态商家此id为7，b站开通商户为18
	 */
	@ApiField("tenant_id")
	private String tenantId;

	/**
	 * 入群欢迎语
	 */
	@ApiField("welcome_msg")
	private String welcomeMsg;

	public String getClusterId() {
		return this.clusterId;
	}
	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public String getNotice() {
		return this.notice;
	}
	public void setNotice(String notice) {
		this.notice = notice;
	}

	public String getOperateBusinessId() {
		return this.operateBusinessId;
	}
	public void setOperateBusinessId(String operateBusinessId) {
		this.operateBusinessId = operateBusinessId;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getWelcomeMsg() {
		return this.welcomeMsg;
	}
	public void setWelcomeMsg(String welcomeMsg) {
		this.welcomeMsg = welcomeMsg;
	}

}
