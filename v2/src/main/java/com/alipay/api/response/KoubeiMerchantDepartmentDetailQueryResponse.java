package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SimpleShopModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.department.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:39
 */
public class KoubeiMerchantDepartmentDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8515882183574356411L;

	/** 
	 * 人员管理场景的部门id
	 */
	@ApiField("dept_id")
	private String deptId;

	/** 
	 * 员工管理场景下的商户部门名称，根目录为商户名称，下属部门由商户自己创建，例如可以创建下属部门为“华东大区”
	 */
	@ApiField("dept_name")
	private String deptName;

	/** 
	 * 人员组织场景的部门标签码
	 */
	@ApiField("label_code")
	private String labelCode;

	/** 
	 * 当前部门的上级部门id
	 */
	@ApiField("parent_dept_id")
	private String parentDeptId;

	/** 
	 * 部门下包含的门店
	 */
	@ApiListField("shops")
	@ApiField("simple_shop_model")
	private List<SimpleShopModel> shops;

	/** 
	 * 组织部门类型(5为非叶子部门，6为叶子部门)
	 */
	@ApiField("type")
	private String type;

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getDeptId( ) {
		return this.deptId;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptName( ) {
		return this.deptName;
	}

	public void setLabelCode(String labelCode) {
		this.labelCode = labelCode;
	}
	public String getLabelCode( ) {
		return this.labelCode;
	}

	public void setParentDeptId(String parentDeptId) {
		this.parentDeptId = parentDeptId;
	}
	public String getParentDeptId( ) {
		return this.parentDeptId;
	}

	public void setShops(List<SimpleShopModel> shops) {
		this.shops = shops;
	}
	public List<SimpleShopModel> getShops( ) {
		return this.shops;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getType( ) {
		return this.type;
	}

}
