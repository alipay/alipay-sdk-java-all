package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 海图商机查询
 *
 * @author auto create
 * @since 1.0, 2025-06-18 15:26:02
 */
public class AnttechOceanbaseObglobalLeadsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1728682993543417125L;

	/**
	 * 海图商机查询请求
	 */
	@ApiField("describe_leads_request")
	private GetLeadsByLeadsCodeRequest describeLeadsRequest;

	public GetLeadsByLeadsCodeRequest getDescribeLeadsRequest() {
		return this.describeLeadsRequest;
	}
	public void setDescribeLeadsRequest(GetLeadsByLeadsCodeRequest describeLeadsRequest) {
		this.describeLeadsRequest = describeLeadsRequest;
	}

}
