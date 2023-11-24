package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.mbpcard.gencard.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-21 15:36:52
 */
public class AlipayFundMbpcardGencardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3868382143967596442L;

	/** 
	 * 制卡结果文件路径；支持多个；
已生成和已激活时返回；
	 */
	@ApiListField("file_path_list")
	@ApiField("string")
	private List<String> filePathList;

	/** 
	 * 制卡单号
	 */
	@ApiField("gen_card_no")
	private String genCardNo;

	/** 
	 * 返回码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 返回描述
	 */
	@ApiField("result_msg")
	private String resultMsg;

	/** 
	 * 状态：
ACCEPTED-已受理
GENERATED-已生成
ENABLED-已激活
CLOSED-已关单
	 */
	@ApiField("status")
	private String status;

	public void setFilePathList(List<String> filePathList) {
		this.filePathList = filePathList;
	}
	public List<String> getFilePathList( ) {
		return this.filePathList;
	}

	public void setGenCardNo(String genCardNo) {
		this.genCardNo = genCardNo;
	}
	public String getGenCardNo( ) {
		return this.genCardNo;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
