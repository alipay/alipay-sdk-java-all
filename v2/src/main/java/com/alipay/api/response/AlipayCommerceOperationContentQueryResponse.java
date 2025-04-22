package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BoothContentInfoModel;
import com.alipay.api.domain.OperationExtDataModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.content.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:39
 */
public class AlipayCommerceOperationContentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3841863936288795323L;

	/** 
	 * 内容信息列表 , json 格式 , 每一个展台对应一个 内容列表 .  每一个内容信息模型对应 : ContentInfoModel
	 */
	@ApiListField("content_infos")
	@ApiField("booth_content_info_model")
	private List<BoothContentInfoModel> contentInfos;

	/** 
	 * 非单条内容信息维度的扩展数据
	 */
	@ApiField("ext_data")
	private OperationExtDataModel extData;

	public void setContentInfos(List<BoothContentInfoModel> contentInfos) {
		this.contentInfos = contentInfos;
	}
	public List<BoothContentInfoModel> getContentInfos( ) {
		return this.contentInfos;
	}

	public void setExtData(OperationExtDataModel extData) {
		this.extData = extData;
	}
	public OperationExtDataModel getExtData( ) {
		return this.extData;
	}

}
