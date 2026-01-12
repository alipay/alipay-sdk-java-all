package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 语音播报记录数据回传批量上传接口
 *
 * @author auto create
 * @since 1.0, 2023-10-13 14:30:55
 */
public class AlipayMerchantIndirectIotdataBatchcreateModel extends AlipayObject {

	private static final long serialVersionUID = 3146937295296827448L;

	/**
	 * 播报记录详情字段按照要求传入，列表长度不超过20
	 */
	@ApiListField("speech_record_list")
	@ApiField("speech_record_detail")
	private List<SpeechRecordDetail> speechRecordList;

	public List<SpeechRecordDetail> getSpeechRecordList() {
		return this.speechRecordList;
	}
	public void setSpeechRecordList(List<SpeechRecordDetail> speechRecordList) {
		this.speechRecordList = speechRecordList;
	}

}
