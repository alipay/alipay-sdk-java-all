package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 获取ISV集成页面链接
 *
 * @author auto create
 * @since 1.0, 2024-05-31 09:40:14
 */
public class AlipayCommerceEcAuthorizationRedicturlGetModel extends AlipayObject {

	private static final long serialVersionUID = 1844189545477815998L;

	/**
	 * 授权令牌
	 */
	@ApiField("access_token")
	private String accessToken;

	/**
	 * 员工id
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 费用类型(制度新增/编辑时所用)
	 */
	@ApiField("expense_type")
	private String expenseType;

	/**
	 * 费用类型列表
	 */
	@ApiListField("expense_types")
	@ApiField("string")
	private List<String> expenseTypes;

	/**
	 * 制度id
	 */
	@ApiField("institution_id")
	private String institutionId;

	/**
	 * 页面菜单key
	 */
	@ApiField("menu_key")
	private String menuKey;

	/**
	 * [{"fieldValue":"CAR","filedName":"expenseType"}]
	 */
	@ApiListField("open_attribute_list")
	@ApiField("open_attribute_d_t_o")
	private List<OpenAttributeDTO> openAttributeList;

	/**
	 * 场景类型
	 */
	@ApiField("scene_type")
	private String sceneType;

	public String getAccessToken() {
		return this.accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getExpenseType() {
		return this.expenseType;
	}
	public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
	}

	public List<String> getExpenseTypes() {
		return this.expenseTypes;
	}
	public void setExpenseTypes(List<String> expenseTypes) {
		this.expenseTypes = expenseTypes;
	}

	public String getInstitutionId() {
		return this.institutionId;
	}
	public void setInstitutionId(String institutionId) {
		this.institutionId = institutionId;
	}

	public String getMenuKey() {
		return this.menuKey;
	}
	public void setMenuKey(String menuKey) {
		this.menuKey = menuKey;
	}

	public List<OpenAttributeDTO> getOpenAttributeList() {
		return this.openAttributeList;
	}
	public void setOpenAttributeList(List<OpenAttributeDTO> openAttributeList) {
		this.openAttributeList = openAttributeList;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

}
