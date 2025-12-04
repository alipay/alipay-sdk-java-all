package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业码可信渠道企业认证同步
 *
 * @author auto create
 * @since 1.0, 2025-11-03 15:02:40
 */
public class AlipayCommerceEcEnterpriseReliableauthSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2647115285153466921L;

	/**
	 * 企业注册来源渠道<br/>
调用方根据实际来源传入对应值

	 */
	@ApiField("access_channel")
	private String accessChannel;

	/**
	 * 统一社会信用代码
	 */
	@ApiField("enterprise_code")
	private String enterpriseCode;

	/**
	 * 企业id<br/>
可信渠道通过创建企业接口后，获得的企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 企业名称
	 */
	@ApiField("enterprise_name")
	private String enterpriseName;

	public String getAccessChannel() {
		return this.accessChannel;
	}
	public void setAccessChannel(String accessChannel) {
		this.accessChannel = accessChannel;
	}

	public String getEnterpriseCode() {
		return this.enterpriseCode;
	}
	public void setEnterpriseCode(String enterpriseCode) {
		this.enterpriseCode = enterpriseCode;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getEnterpriseName() {
		return this.enterpriseName;
	}
	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

}
