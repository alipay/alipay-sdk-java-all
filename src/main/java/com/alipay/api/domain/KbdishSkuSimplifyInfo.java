package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 菜品简化接口sku信息
 *
 * @author auto create
 * @since 1.0, 2020-12-10 14:08:02
 */
public class KbdishSkuSimplifyInfo extends AlipayObject {

	private static final long serialVersionUID = 3395485577951411678L;

	/**
	 * 加料组列表
	 */
	@ApiListField("material_group_list")
	@ApiField("kbdish_material_simplify_info")
	private List<KbdishMaterialSimplifyInfo> materialGroupList;

	/**
	 * 外部skuId
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 价格
	 */
	@ApiField("price")
	private String price;

	/**
	 * 规格1组名称
	 */
	@ApiField("spec_01_group_name")
	private String spec01GroupName;

	/**
	 * 规格1的id
	 */
	@ApiField("spec_01_id")
	private String spec01Id;

	/**
	 * 规格1名称
	 */
	@ApiField("spec_01_name")
	private String spec01Name;

	/**
	 * 规格1排序值
	 */
	@ApiField("spec_01_sort")
	private String spec01Sort;

	/**
	 * 规格2组名称
	 */
	@ApiField("spec_02_group_name")
	private String spec02GroupName;

	/**
	 * 规格2的id
	 */
	@ApiField("spec_02_id")
	private String spec02Id;

	/**
	 * 规格2的名称
	 */
	@ApiField("spec_02_name")
	private String spec02Name;

	/**
	 * 规格2的排序值
	 */
	@ApiField("spec_02_sort")
	private String spec02Sort;

	public List<KbdishMaterialSimplifyInfo> getMaterialGroupList() {
		return this.materialGroupList;
	}
	public void setMaterialGroupList(List<KbdishMaterialSimplifyInfo> materialGroupList) {
		this.materialGroupList = materialGroupList;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getSpec01GroupName() {
		return this.spec01GroupName;
	}
	public void setSpec01GroupName(String spec01GroupName) {
		this.spec01GroupName = spec01GroupName;
	}

	public String getSpec01Id() {
		return this.spec01Id;
	}
	public void setSpec01Id(String spec01Id) {
		this.spec01Id = spec01Id;
	}

	public String getSpec01Name() {
		return this.spec01Name;
	}
	public void setSpec01Name(String spec01Name) {
		this.spec01Name = spec01Name;
	}

	public String getSpec01Sort() {
		return this.spec01Sort;
	}
	public void setSpec01Sort(String spec01Sort) {
		this.spec01Sort = spec01Sort;
	}

	public String getSpec02GroupName() {
		return this.spec02GroupName;
	}
	public void setSpec02GroupName(String spec02GroupName) {
		this.spec02GroupName = spec02GroupName;
	}

	public String getSpec02Id() {
		return this.spec02Id;
	}
	public void setSpec02Id(String spec02Id) {
		this.spec02Id = spec02Id;
	}

	public String getSpec02Name() {
		return this.spec02Name;
	}
	public void setSpec02Name(String spec02Name) {
		this.spec02Name = spec02Name;
	}

	public String getSpec02Sort() {
		return this.spec02Sort;
	}
	public void setSpec02Sort(String spec02Sort) {
		this.spec02Sort = spec02Sort;
	}

}
