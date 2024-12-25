package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecommendAccountDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.operation.qrcode.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-14 14:08:50
 */
public class AlipayOpenSpOperationQrcodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7395341871765115128L;

	/** 
	 * 支付宝操作批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/** 
	 * 商家已经绑定的支付宝账号信息
	 */
	@ApiField("bind_account")
	private RecommendAccountDTO bindAccount;

	/** 
	 * 二维码图片地址，urlEncode处理过。
注意：
1.有效期为24h;
2.用户扫码确认授权操作（同意/拒绝）后，支付宝将通过<a href="https://opendocs.alipay.com/apis/01lc2d">alipay.open.sp.operation.result.notify</a>接口发送异步通知给服务商。
	 */
	@ApiField("qr_code_url")
	private String qrCodeUrl;

	/** 
	 * 只针对服务商代间连商家发起代运营绑定、授权时，如果传递的alipay_account不符合绑定或授权要求，这个字段会返回推荐的商家支付宝账号列表，包括：支付宝账号和名称，为保护商家信息，账号和名称都按照规范脱敏。
	 */
	@ApiListField("recommend_account_list")
	@ApiField("recommend_account_d_t_o")
	private List<RecommendAccountDTO> recommendAccountList;

	/** 
	 * 只针对服务商代间连商家发起代运营绑定、授权时，这个字段会返回推荐的商家支付宝账号列表，包括：支付宝账号和名称，为保护商家信息，账号和名称都按照规范脱敏。
	 */
	@ApiField("recommend_accounts")
	private RecommendAccountDTO recommendAccounts;

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getBatchNo( ) {
		return this.batchNo;
	}

	public void setBindAccount(RecommendAccountDTO bindAccount) {
		this.bindAccount = bindAccount;
	}
	public RecommendAccountDTO getBindAccount( ) {
		return this.bindAccount;
	}

	public void setQrCodeUrl(String qrCodeUrl) {
		this.qrCodeUrl = qrCodeUrl;
	}
	public String getQrCodeUrl( ) {
		return this.qrCodeUrl;
	}

	public void setRecommendAccountList(List<RecommendAccountDTO> recommendAccountList) {
		this.recommendAccountList = recommendAccountList;
	}
	public List<RecommendAccountDTO> getRecommendAccountList( ) {
		return this.recommendAccountList;
	}

	public void setRecommendAccounts(RecommendAccountDTO recommendAccounts) {
		this.recommendAccounts = recommendAccounts;
	}
	public RecommendAccountDTO getRecommendAccounts( ) {
		return this.recommendAccounts;
	}

}
