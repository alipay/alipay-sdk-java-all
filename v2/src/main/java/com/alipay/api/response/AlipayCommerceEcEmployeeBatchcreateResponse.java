package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EcEmployeeBatchAddFailInfo;
import com.alipay.api.domain.EcEmployeeBatchAddSuccessInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.employee.batchcreate response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-08 11:51:43
 */
public class AlipayCommerceEcEmployeeBatchcreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6628192568433152449L;

	/** 
	 * 添加失败员工，如果没有添加失败员工，则不返回该字段
	 */
	@ApiListField("employee_add_fail_list")
	@ApiField("ec_employee_batch_add_fail_info")
	private List<EcEmployeeBatchAddFailInfo> employeeAddFailList;

	/** 
	 * 添加成功员工，如果没有添加成功员工，则不返回该字段
	 */
	@ApiListField("employee_add_success_list")
	@ApiField("ec_employee_batch_add_success_info")
	private List<EcEmployeeBatchAddSuccessInfo> employeeAddSuccessList;

	/** 
	 * 资金代付签约链接 1.员工未绑支付宝，拉起员工绑定页面 2.员工已绑支付宝，拉起资金签约页面
	 */
	@ApiField("sign_url")
	private String signUrl;

	public void setEmployeeAddFailList(List<EcEmployeeBatchAddFailInfo> employeeAddFailList) {
		this.employeeAddFailList = employeeAddFailList;
	}
	public List<EcEmployeeBatchAddFailInfo> getEmployeeAddFailList( ) {
		return this.employeeAddFailList;
	}

	public void setEmployeeAddSuccessList(List<EcEmployeeBatchAddSuccessInfo> employeeAddSuccessList) {
		this.employeeAddSuccessList = employeeAddSuccessList;
	}
	public List<EcEmployeeBatchAddSuccessInfo> getEmployeeAddSuccessList( ) {
		return this.employeeAddSuccessList;
	}

	public void setSignUrl(String signUrl) {
		this.signUrl = signUrl;
	}
	public String getSignUrl( ) {
		return this.signUrl;
	}

}
