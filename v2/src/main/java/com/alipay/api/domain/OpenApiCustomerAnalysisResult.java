package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 增长分析(生意参谋)-经营分析-客户分析下的模块返回体
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:49:53
 */
public class OpenApiCustomerAnalysisResult extends AlipayObject {

	private static final long serialVersionUID = 7529889945958152448L;

	/**
	 * 返回全部用户类型的指标数据
	 */
	@ApiListField("all_user_data")
	@ApiField("open_api_operation_analysis_customer_alias_d_t_o")
	private List<OpenApiOperationAnalysisCustomerAliasDTO> allUserData;

	/**
	 * 返回新用户（新访客）的指标数据
	 */
	@ApiListField("new_user_data")
	@ApiField("open_api_operation_analysis_customer_alias_d_t_o")
	private List<OpenApiOperationAnalysisCustomerAliasDTO> newUserData;

	/**
	 * 用户返回老用户（老客户）的指标数据
	 */
	@ApiListField("old_user_data")
	@ApiField("open_api_operation_analysis_customer_alias_d_t_o")
	private List<OpenApiOperationAnalysisCustomerAliasDTO> oldUserData;

	public List<OpenApiOperationAnalysisCustomerAliasDTO> getAllUserData() {
		return this.allUserData;
	}
	public void setAllUserData(List<OpenApiOperationAnalysisCustomerAliasDTO> allUserData) {
		this.allUserData = allUserData;
	}

	public List<OpenApiOperationAnalysisCustomerAliasDTO> getNewUserData() {
		return this.newUserData;
	}
	public void setNewUserData(List<OpenApiOperationAnalysisCustomerAliasDTO> newUserData) {
		this.newUserData = newUserData;
	}

	public List<OpenApiOperationAnalysisCustomerAliasDTO> getOldUserData() {
		return this.oldUserData;
	}
	public void setOldUserData(List<OpenApiOperationAnalysisCustomerAliasDTO> oldUserData) {
		this.oldUserData = oldUserData;
	}

}
