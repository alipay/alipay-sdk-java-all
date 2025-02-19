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
 * @since 1.0, 2024-07-04 17:31:58
 */
public class AlipayFundJointaccountListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6746911677355115558L;

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
