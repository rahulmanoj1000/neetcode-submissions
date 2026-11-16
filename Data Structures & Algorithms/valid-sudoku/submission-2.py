class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        for i in range(9):
            deck = set()
            for j in range(9):
                if(board[i][j] == '.'):
                    continue
                if(board[i][j] in deck):
                    return False
                else:
                    deck.add(board[i][j])
            
        for i in range(9):
            deck = set()
            for j in range(9):
                if(board[j][i] == '.'):
                    continue
                if(board[j][i] in deck):
                    return False
                else:
                    deck.add(board[j][i])

        for square in range(9):
            deck = set()
            for i in range(3):
                for j in range(3):
                    row = (square // 3) * 3 + i
                    col = (square % 3 ) * 3 + j
                    if board[row][col] == ".":
                        continue
                    if board[row][col] in deck:
                        return False
                    deck.add(board[row][col])
        return True
