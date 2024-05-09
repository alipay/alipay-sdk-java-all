package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MaterialResultInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalop.ucdp.apecreative.pictaskresult.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-27 21:21:59
 */
public class AlipayDigitalopUcdpApecreativePictaskresultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8212573833586878199L;

	/** 
	 * 素材生产结果
	 */
	@ApiField("material_result_info_list")
	private MaterialResultInfo materialResultInfoList;

	/** 
	 * 素材产生结果
	 */
	@ApiListField("material_result_list")
	@ApiField("material_result_info")
	private List<MaterialResultInfo> materialResultList;

	public void setMaterialResultInfoList(MaterialResultInfo materialResultInfoList) {
		this.materialResultInfoList = materialResultInfoList;
	}
	public MaterialResultInfo getMaterialResultInfoList( ) {
		return this.materialResultInfoList;
	}

	public void setMaterialResultList(List<MaterialResultInfo> materialResultList) {
		this.materialResultList = materialResultList;
	}
	public List<MaterialResultInfo> getMaterialResultList( ) {
		return this.materialResultList;
	}

}
