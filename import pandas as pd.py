import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

# 1. Create a DataFrame with missing values and duplicates
data = {
    'Name': ['Alice', 'Bob', 'Charlie', 'Alice', 'David', 'Eve', 'Frank', 'Alice', 'Grace', 'Heidi'],
    'Age': [25, 30, np.nan, 25, 35, 28, 40, 25, 32, np.nan],
    'Score': [85, 92, 78, 85, 95, 88, 70, 85, 90, 80]
}
df = pd.DataFrame(data)

print("Original DataFrame:")
print(df)
print("\n")

# 2. Handle missing values
# Option 1: Fill missing 'Age' values with the mean of the 'Age' column
df['Age'].fillna(df['Age'].mean(), inplace=True)

# Option 2: Drop rows with any remaining missing values (if any columns other than 'Age' had NaNs)
# df.dropna(inplace=True)

print("DataFrame after handling missing values:")
print(df)
print("\n")

# 3. Handle duplicate values
# Identify and print duplicate rows
print("Duplicate rows:")
print(df[df.duplicated()])
print("\n")

# Remove duplicate rows based on all columns
df.drop_duplicates(inplace=True)

print("DataFrame after handling duplicate values:")
print(df)
print("\n")

# 4. Create a histogram for a numerical column (e.g., 'Age')
plt.figure(figsize=(8, 6))
plt.hist(df['Age'], bins=5, edgecolor='black') # Adjust 'bins' for desired granularity
plt.title('Distribution of Ages')
plt.xlabel('Age')
1
plt.grid(axis='y', alpha=0.75)
plt.show()

# Create a histogram for 'Score'
plt.figure(figsize=(8, 6))
df['Score'].plot(kind='hist', bins=10, edgecolor='black', title='Distribution of Scores')
plt.xlabel('Score')
plt.ylabel('Frequency')
plt.grid(axis='y', alpha=0.75)
plt.show()
