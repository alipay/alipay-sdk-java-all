package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 补充信息
 *
 * @author auto create
 * @since 1.0, 2025-12-16 14:42:43
 */
public class BrandAuthAdditionalInfoOpenApi extends AlipayObject {

	private static final long serialVersionUID = 5882899574911519228L;

	/**
	 * null
	 */
	@ApiListField("brand_app_infos")
	@ApiField("brand_app_info_open_api")
	private List<BrandAppInfoOpenApi> brandAppInfos;

	/**
	 * 品牌logo
	 */
	@ApiField("brand_op_logo")
	private BrandFileInfoOpenApi brandOpLogo;

	/**
	 * null
	 */
	@ApiListField("brand_use_scene")
	@ApiField("string")
	private List<String> brandUseScene;

	public List<BrandAppInfoOpenApi> getBrandAppInfos() {
		return this.brandAppInfos;
	}
	public void setBrandAppInfos(List<BrandAppInfoOpenApi> brandAppInfos) {
		this.brandAppInfos = brandAppInfos;
	}

	public BrandFileInfoOpenApi getBrandOpLogo() {
		return this.brandOpLogo;
	}
	public void setBrandOpLogo(BrandFileInfoOpenApi brandOpLogo) {
		this.brandOpLogo = brandOpLogo;
	}

	public List<String> getBrandUseScene() {
		return this.brandUseScene;
	}
	public void setBrandUseScene(List<String> brandUseScene) {
		this.brandUseScene = brandUseScene;
	}

}
