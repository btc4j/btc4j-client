/*
 The MIT License (MIT)
 
 Copyright (c) 2013, 2014 by Guillermo Gonzalez, btc4j.org

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in all
 copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 SOFTWARE.
 */

package org.btc4j.client;

import java.io.File;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.btc4j.core.BtcAccount;
import org.btc4j.core.BtcAddedNode;
import org.btc4j.core.BtcAddress;
import org.btc4j.core.BtcApi;
import org.btc4j.core.BtcBlock;
import org.btc4j.core.BtcBlockSubmission;
import org.btc4j.core.BtcBlockTemplate;
import org.btc4j.core.BtcException;
import org.btc4j.core.BtcLastBlock;
import org.btc4j.core.BtcMiningInfo;
import org.btc4j.core.BtcMultiSignatureAddress;
import org.btc4j.core.BtcNode;
import org.btc4j.core.BtcOutput;
import org.btc4j.core.BtcOutputPart;
import org.btc4j.core.BtcOutputSet;
import org.btc4j.core.BtcPeer;
import org.btc4j.core.BtcInfo;
import org.btc4j.core.BtcRawTransaction;
import org.btc4j.core.BtcTransaction;
import org.btc4j.core.BtcWork;

public class BtcClient implements BtcApi {

	@Override
	public String addMultiSignatureAddress(long required, List<String> keys,
			String account) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public void addNode(String node, BtcNode.Operation operation)
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public void backupWallet(File destination) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public BtcMultiSignatureAddress createMultiSignatureAddress(long required,
			List<String> keys) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public String createRawTransaction(List<BtcOutputPart> outputs,
			Map<String, BigDecimal> amounts) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public BtcRawTransaction decodeRawTransaction(String hex)
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public String dumpPrivateKey(String address) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public String getAccount(String address) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public String getAccountAddress(String account) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public List<BtcAddedNode> getAddedNodeInformation(boolean dns, String node)
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public List<String> getAddressesByAccount(String account)
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public BigDecimal getBalance(String account, long minConfirms)
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public BtcBlock getBlock(String hash) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public long getBlockCount() throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public String getBlockHash(long index) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public BtcBlockTemplate getBlockTemplate(List<BtcBlockTemplate.Capability> capabilities, BtcBlockTemplate.Mode mode) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);

	}

	@Override
	public long getConnectionCount() throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public BigDecimal getDifficulty() throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public boolean getGenerate() throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public long getHashesPerSecond() throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public BtcInfo getInformation() throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public BtcMiningInfo getMiningInformation() throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public String getNewAddress(String account) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public List<BtcPeer> getPeerInformation() throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public List<String> getRawMemoryPool() throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public BtcRawTransaction getRawTransaction(String transactionId,
			boolean verbose) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public BigDecimal getReceivedByAccount(String account, long minConfirms)
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public BigDecimal getReceivedByAddress(String address, long minConfirms)
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public BtcTransaction getTransaction(String transactionId)
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public BtcOutput getTransactionOutput(String transactionId, long index,
			boolean includeMemoryPool) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public BtcOutputSet getTransactionOutputSetInformation()
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public BtcWork getWork(String data) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	public String help() throws BtcException {
		return help("");
	}

	public String help(String command) throws BtcException {
		return "Bitcoin Client not yet implemented";
	}

	@Override
	public String importPrivateKey(String privateKey, String label,
			boolean rescan) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public void keyPoolRefill() throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public Map<String, BtcAccount> listAccounts(long minConfirms) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public List<BtcAddress> listAddressGroupings() throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public List<BtcOutput> listLockUnspent() throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public List<BtcAccount> listReceivedByAccount(long minConfirms,
			boolean includeEmpty) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public List<BtcAddress> listReceivedByAddress(long minConfirms,
			boolean includeEmpty) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public BtcLastBlock listSinceBlock(String hash, long targetConfirms)
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public List<BtcTransaction> listTransactions(String account, long count,
			long from) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public List<BtcOutput> listUnspent(long minConfirms, long maxConfirms)
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public void lockUnspent(boolean unlock, List<BtcOutputPart> outputs)
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public boolean move(String account, String toAccount, BigDecimal amount,
			long minConfirms, String comment) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public String sendFrom(String account, String address,
			BigDecimal amount, long minConfirms, String comment,
			String commentTo) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public String sendMany(String account, Map<String, BigDecimal> amounts,
			long minConfirms, String comment)
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public void sendRawTransaction(String transactionId) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public String sendToAddress(String address, BigDecimal amount,
			String comment, String commentTo) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public void setAccount(String address, String account) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public void setGenerate(boolean generate, long generateProcessorsLimit)
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public boolean setTransactionFee(BigDecimal amount) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public String signMessage(String address, String message) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public void signRawTransaction(String transactionId,
			List<Object> signatures, List<String> keys) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	public String stop() throws BtcException {
		return "Stopping Bitcoin Client";
	}

	@Override
	public BtcBlockSubmission submitBlock(String data, String workId, Map<String, String> params)
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public BtcAddress validateAddress(String address) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public boolean verifyMessage(String address, String signature, String message)
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}
	
	@Override
	public void walletLock() throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public void walletPassphrase(String passphrase, long timeout)
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public void walletPassphraseChange(String passphrase, String newPassphrase)
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}
}