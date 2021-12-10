package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.JointAccountDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.jointaccount.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-18 10:44:24
 */
public class AlipayFundJointaccountListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7441814252853621356L;

	/** 
	 * 共同账户列表
	 */
	@ApiListField("account_list")
	@ApiField("joint_account_d_t_o")
	private List<JointAccountDTO> accountList;

	/** 
	 * 场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public void setAccountList(List<JointAccountDTO> accountList) {
		this.accountList = accountList;
	}
	public List<JointAccountDTO> getAccountList( ) {
		return this.accountList;
	}

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene( ) {
		return this.bizScene;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

}
