package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EduRoleInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.role.info.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-17 17:32:59
 */
public class AlipayCommerceEducateRoleInfoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3824215474415267859L;

	/** 
	 * 角色列表
	 */
	@ApiListField("role_list")
	@ApiField("edu_role_info")
	private List<EduRoleInfo> roleList;

	/** 
	 * 总数量
	 */
	@ApiField("total_num")
	private Long totalNum;

	public void setRoleList(List<EduRoleInfo> roleList) {
		this.roleList = roleList;
	}
	public List<EduRoleInfo> getRoleList( ) {
		return this.roleList;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

}
