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
import java.util.List;
import java.util.Map;

import org.btc4j.core.BtcAccount;
import org.btc4j.core.BtcAddress;
import org.btc4j.core.BtcApi;
import org.btc4j.core.BtcBlock;
import org.btc4j.core.BtcException;
import org.btc4j.core.BtcLastBlock;
import org.btc4j.core.BtcMining;
import org.btc4j.core.BtcNodeOperationEnum;
import org.btc4j.core.BtcPeer;
import org.btc4j.core.BtcStatus;
import org.btc4j.core.BtcTransaction;
import org.btc4j.core.BtcTransactionOutputSet;

public class BtcClient implements BtcApi {

	@Override
	public void addMultiSignatureAddress(int required, List<String> keys,
			String account) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public void addNode(String node, BtcNodeOperationEnum operation)
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
	public String createMultiSignatureAddress(int required, List<String> keys)
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public String createRawTransaction(List<Object> transactionIds,
			List<Object> addresses) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public String decodeRawTransaction(String transactionId)
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
	public void encryptWallet(String passPhrase) throws BtcException {
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
	public String getAddedNodeInformation(boolean dns, String node)
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
	public double getBalance(String account, int minConfirms)
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
	public int getBlockCount() throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public String getBlockHash(int index) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public String getBlockTemplate(String params) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);

	}

	@Override
	public int getConnectionCount() throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public double getDifficulty() throws BtcException {
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
	public int getHashesPerSecond() throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public BtcStatus getInformation() throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public BtcMining getMiningInformation() throws BtcException {
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
	public String getRawTransaction(String transactionId, boolean verbose)
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public double getReceivedByAccount(String account, int minConfirms)
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public double getReceivedByAddress(String address, int minConfirms)
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public String getTransaction(String transactionId) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public String getTransactionOutput(String transactionId, int n,
			boolean includeMemoryPool) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public BtcTransactionOutputSet getTransactionOutputSetInformation()
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public String getWork(String data) throws BtcException {
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
	public Map<String, BtcAccount> listAccounts(int minConfirms)
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public List<String> listAddressGroupings() throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public List<String> listLockUnspent() throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public List<BtcAccount> listReceivedByAccount(int minConfirms,
			boolean includeEmpty) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public List<BtcAddress> listReceivedByAddress(int minConfirms,
			boolean includeEmpty) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public BtcLastBlock listSinceBlock(String blockHash, int targetConfirms)
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public List<BtcTransaction> listTransactions(String account, int count, int from)
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public List<String> listUnspent(int minConfirms, int maxConfirms)
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public void lockUnspent(boolean unlock, List<Object> outputs)
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public void move(String fromAccount, String toAccount, double amount,
			int minConfirms, String comment) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public String sendFrom(String fromAccount, String toAddress, double amount,
			int minConfirms, String commentFrom, String commentTo)
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public String sendMany(String fromAccount, List<Object> addresses,
			int minConfirms, String commentFrom, String commentTo)
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public void sendRawTransaction(String transactionId)
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public String sendToAddress(String toAddress, double amount,
			String commentFrom, String commentTo) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public void setAccount(String address, String account)
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public void setGenerate(boolean generate, int generateProcessorsLimit)
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public boolean setTransactionFee(double amount) throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public void signMessage(String address, String message)
			throws BtcException {
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
	public void submitBlock(String data, List<Object> params)
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public BtcAddress validateAddress(String address)
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}

	@Override
	public String verifyMessage(String address, String signature, String message)
			throws BtcException {
		throw new BtcException(BtcException.BTC4J_ERROR_CODE,
				BtcException.BTC4J_ERROR_MESSAGE + ": "
						+ BtcException.BTC4J_ERROR_DATA_NOT_IMPLEMENTED);
	}
}