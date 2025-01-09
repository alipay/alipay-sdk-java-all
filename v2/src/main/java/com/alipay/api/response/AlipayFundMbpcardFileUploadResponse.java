package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OcrData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.mbpcard.file.upload response.
 * 
 * @author auto create
 * @since 1.0, 2024-02-01 16:31:58
 */
public class AlipayFundMbpcardFileUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 7648881187198543323L;

	/** 
	 * 影像文件存储平台的标识
	 */
	@ApiField("image_id")
	private String imageId;

	/** 
	 * 支持OCR识别的内容反显
	 */
	@ApiListField("ocr_data")
	@ApiField("ocr_data")
	private List<OcrData> ocrData;

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	public String getImageId( ) {
		return this.imageId;
	}

	public void setOcrData(List<OcrData> ocrData) {
		this.ocrData = ocrData;
	}
	public List<OcrData> getOcrData( ) {
		return this.ocrData;
	}

}
