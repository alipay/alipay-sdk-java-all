package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 素材库删除
 *
 * @author auto create
 * @since 1.0, 2025-03-28 15:30:40
 */
public class AlipayDataDataserviceAdMateriallibraryDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4679369298795672911L;

	/**
	 * 素材类型，1图片2视频
	 */
	@ApiField("material_type")
	private Long materialType;

	/**
	 * 商家标志,唯一值,在广告投放平台商家详情获取。
	 */
	@ApiField("principal_tag")
	private String principalTag;

	/**
	 * 广告主需要删除的素材id列表值
	 */
	@ApiListField("user_material_id_list")
	@ApiField("string")
	private List<String> userMaterialIdList;

	public Long getMaterialType() {
		return this.materialType;
	}
	public void setMaterialType(Long materialType) {
		this.materialType = materialType;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

	public List<String> getUserMaterialIdList() {
		return this.userMaterialIdList;
	}
	public void setUserMaterialIdList(List<String> userMaterialIdList) {
		this.userMaterialIdList = userMaterialIdList;
	}

}
