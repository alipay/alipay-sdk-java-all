package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑菜品通用组模型
 *
 * @author auto create
 * @since 1.0, 2020-09-07 16:13:46
 */
public class KbdishCommGroupInfo extends AlipayObject {

	private static final long serialVersionUID = 2398531338291319545L;

	/**
	 * 通用组id 口碑生成；新增时非必填
	 */
	@ApiField("comm_group_id")
	private String commGroupId;

	/**
	 * 创建人
	 */
	@ApiField("create_user")
	private String createUser;

	/**
	 * 扩展字段，用户扩展字段的透出填写，不做约束
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 组描述
	 */
	@ApiField("group_desc")
	private String groupDesc;

	/**
	 * 组的名称，标示一个组的中文，可重复
	 */
	@ApiField("group_name")
	private String groupName;

	/**
	 * materialGroup 加料组
propertyGroup 属性组
	 */
	@ApiField("group_type")
	private String groupType;

	/**
	 * 组明细列表
	 */
	@ApiListField("kbdish_comm_group_detail_info_list")
	@ApiField("kbdish_comm_group_detail_info")
	private List<KbdishCommGroupDetailInfo> kbdishCommGroupDetailInfoList;

	/**
	 * 商户id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 修改人
	 */
	@ApiField("update_user")
	private String updateUser;

	/**
	 * 组在口碑C端展示的样式，枚举如下：
list：明细以列表展示
select：每行展示3个明细；对于加料，选中明细时，份数默认为1份，不能调整
selectWithAdjust：每行展示3个明细；对于加料选中明细时，在份数区块可以进行份数调整
listWithCheckBox：明细以列表的方式展示，带有勾选框
	 */
	@ApiField("view_tag")
	private String viewTag;

	public String getCommGroupId() {
		return this.commGroupId;
	}
	public void setCommGroupId(String commGroupId) {
		this.commGroupId = commGroupId;
	}

	public String getCreateUser() {
		return this.createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getGroupDesc() {
		return this.groupDesc;
	}
	public void setGroupDesc(String groupDesc) {
		this.groupDesc = groupDesc;
	}

	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupType() {
		return this.groupType;
	}
	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}

	public List<KbdishCommGroupDetailInfo> getKbdishCommGroupDetailInfoList() {
		return this.kbdishCommGroupDetailInfoList;
	}
	public void setKbdishCommGroupDetailInfoList(List<KbdishCommGroupDetailInfo> kbdishCommGroupDetailInfoList) {
		this.kbdishCommGroupDetailInfoList = kbdishCommGroupDetailInfoList;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getUpdateUser() {
		return this.updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public String getViewTag() {
		return this.viewTag;
	}
	public void setViewTag(String viewTag) {
		this.viewTag = viewTag;
	}

}
