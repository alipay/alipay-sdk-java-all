package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建客户关联渠道账号接口
 *
 * @author auto create
 * @since 1.0, 2024-04-07 15:27:06
 */
public class AnttechOceanbaseObglobalCustomerchannelaccouCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5784724733293793421L;

	/**
	 * 创建客户关联渠道账号请求体
	 */
	@ApiField("create_customer_channel_account_request")
	private CreateCustomerChannelAccountRequest createCustomerChannelAccountRequest;

	public CreateCustomerChannelAccountRequest getCreateCustomerChannelAccountRequest() {
		return this.createCustomerChannelAccountRequest;
	}
	public void setCreateCustomerChannelAccountRequest(CreateCustomerChannelAccountRequest createCustomerChannelAccountRequest) {
		this.createCustomerChannelAccountRequest = createCustomerChannelAccountRequest;
	}

}
