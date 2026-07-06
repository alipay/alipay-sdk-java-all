package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayCommerceIotDapplyOrderBatchcreateResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.commerce.iot.dapply.order.batchcreate request
 * 
 * @author auto create
 * @since 1.0, 2026-07-03 15:30:18
 */
public class AlipayCommerceIotDapplyOrderBatchcreateRequest implements AlipayUploadRequest<AlipayCommerceIotDapplyOrderBatchcreateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 申请人的手机号
	 */
	private String applicantMobile;

	/** 
	* 自定义申请人名称，不作业务校验
	 */
	private String applicantName;

	/** 
	* 如果是商户需要传MERCHANTPORTAL，如果是服务商需要传ISV
	 */
	private String channelCode;

	/** 
	* 批量申请时excel文件内容，将文件内容转成字节流传入
	 */
	private FileItem fileContent;

	/** 
	* 设备ItemId（物料ID），首次接入时需要咨询业务经理进行获取
	 */
	private String itemId;

	/** 
	* 商品ID，首次接入时请咨询业务经理进行获取
	 */
	private String mallItemId;

	/** 
	* 订单备注，业务根据自己的场景进行备注信息，可通过订单详情返回
	 */
	private String memo;

	/** 
	* 外部业务流水号(作为请求幂等号)
	 */
	private String outBizNo;

	/** 
	* 人工操作对应平台为商家中心(b.alipay.com)时填MERCHANTPORTAL，服务商平台(p.alipay.com)时填ISV
	 */
	private String sourceCode;

	/** 
	* 支架配件商品ID，首次接入时需要咨询业务经理进行获取
	 */
	private String supportMallItemId;

	/** 
	* 批量申请总的设备数量，必须和文件里面的申请数量总和一致
	 */
	private Long totalApplyAmount;

	/** 
	* 批量申请的条目数，必须和文件对应的条目数(去除表头）一致。
	 */
	private Long totalApplyCount;

	/** 
	* USB配件商品对应的MallItemId(MI),首次接入时需咨询业务经理进行获取
	 */
	private String usbMallItemId;

	public void setApplicantMobile(String applicantMobile) {
		this.applicantMobile = applicantMobile;
	}
	public String getApplicantMobile() {
		return this.applicantMobile;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getApplicantName() {
		return this.applicantName;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}
	public String getChannelCode() {
		return this.channelCode;
	}

	public void setFileContent(FileItem fileContent) {
		this.fileContent = fileContent;
	}
	public FileItem getFileContent() {
		return this.fileContent;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId() {
		return this.itemId;
	}

	public void setMallItemId(String mallItemId) {
		this.mallItemId = mallItemId;
	}
	public String getMallItemId() {
		return this.mallItemId;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo() {
		return this.memo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo() {
		return this.outBizNo;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}
	public String getSourceCode() {
		return this.sourceCode;
	}

	public void setSupportMallItemId(String supportMallItemId) {
		this.supportMallItemId = supportMallItemId;
	}
	public String getSupportMallItemId() {
		return this.supportMallItemId;
	}

	public void setTotalApplyAmount(Long totalApplyAmount) {
		this.totalApplyAmount = totalApplyAmount;
	}
	public Long getTotalApplyAmount() {
		return this.totalApplyAmount;
	}

	public void setTotalApplyCount(Long totalApplyCount) {
		this.totalApplyCount = totalApplyCount;
	}
	public Long getTotalApplyCount() {
		return this.totalApplyCount;
	}

	public void setUsbMallItemId(String usbMallItemId) {
		this.usbMallItemId = usbMallItemId;
	}
	public String getUsbMallItemId() {
		return this.usbMallItemId;
	}
	private String terminalType;
	private String terminalInfo;
	private String prodCode;
	private String notifyUrl;
	private String returnUrl;
    private boolean needEncrypt=false;
	private AlipayObject bizModel=null;

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getReturnUrl() {
		return this.returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getApiVersion() {
		return this.apiVersion;
	}
	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public void setTerminalType(String terminalType){
		this.terminalType=terminalType;
	}
	
    public String getTerminalType(){
    	return this.terminalType;
    }

    public void setTerminalInfo(String terminalInfo){
    	this.terminalInfo=terminalInfo;
    }

    public String getTerminalInfo(){
    	return this.terminalInfo;
    }
	
	public String getProdCode() {
		return this.prodCode; 
	}
	
	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}
    
	public String getApiMethodName() {
		return "alipay.commerce.iot.dapply.order.batchcreate";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("applicant_mobile", this.applicantMobile);
		txtParams.put("applicant_name", this.applicantName);
		txtParams.put("channel_code", this.channelCode);
		txtParams.put("item_id", this.itemId);
		txtParams.put("mall_item_id", this.mallItemId);
		txtParams.put("memo", this.memo);
		txtParams.put("out_biz_no", this.outBizNo);
		txtParams.put("source_code", this.sourceCode);
		txtParams.put("support_mall_item_id", this.supportMallItemId);
		txtParams.put("total_apply_amount", this.totalApplyAmount);
		txtParams.put("total_apply_count", this.totalApplyCount);
		txtParams.put("usb_mall_item_id", this.usbMallItemId);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}
	
	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new AlipayHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("file_content", this.fileContent);
		return params;
	}

	public Class<AlipayCommerceIotDapplyOrderBatchcreateResponse> getResponseClass() {
		return AlipayCommerceIotDapplyOrderBatchcreateResponse.class;
	}
	
	 public boolean isNeedEncrypt() {
    
      return this.needEncrypt;
    }


    public void setNeedEncrypt(boolean needEncrypt) {
    
         this.needEncrypt=needEncrypt;
    }
    
    public AlipayObject getBizModel() {
    
      return this.bizModel;
    }


    public void setBizModel(AlipayObject bizModel) {
    
         this.bizModel=bizModel;
    }
	
	
}
