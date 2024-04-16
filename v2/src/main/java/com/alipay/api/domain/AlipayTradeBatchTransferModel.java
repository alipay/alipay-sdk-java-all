package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 请款分账
 *
 * @author auto create
 * @since 1.0, 2024-01-02 16:58:36
 */
public class AlipayTradeBatchTransferModel extends AlipayObject {

	private static final long serialVersionUID = 7459528367467387291L;

	/**
	 * 业务扩展参数
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 结算请求外部流水号，32个字符以内、可包含字母、数字、下划线；需保证在商户端不重复
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 分账条款明细
特别注意：最好一次只传一个分账条款。
如果传多个，则要求出账方只能有一个，
举例：A分给B+A分给C+A分给D=OK
A分给B+C分给D=不行
	 */
	@ApiListField("royalty_parameters")
	@ApiField("royalty_detail_info")
	private List<RoyaltyDetailInfo> royaltyParameters;

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public List<RoyaltyDetailInfo> getRoyaltyParameters() {
		return this.royaltyParameters;
	}
	public void setRoyaltyParameters(List<RoyaltyDetailInfo> royaltyParameters) {
		this.royaltyParameters = royaltyParameters;
	}

}
